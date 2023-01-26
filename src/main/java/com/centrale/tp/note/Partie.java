/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.centrale.tp.note;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Classe Partie qui définit le déroulement d'une partie
 *
 * @author Canal_Conraux
 */
public class Partie {

    /**
     * Entier qui définit le nombre de manches
     */
    private int m_nbManche;
    /**
     * Liste des différentes manches
     */
    private List<Manche> m_manches;
    /**
     * Permier joueur participant à la partie
     */
    private Joueur m_joueurA;
    /**
     * Deuxième joueur participant à la partie
     */
    private Joueur m_joueurB;
    /**
     * Indique si la partie est finie ou non
     */
    private boolean m_over;

    /**
     *
     * @return
     */
    public int getM_nbManche() {
        return m_nbManche;
    }

    /**
     *
     * @param m_nbManche
     */
    public void setM_nbManche(int m_nbManche) {
        this.m_nbManche = m_nbManche;
    }

    /**
     *
     * @return
     */
    public List<Manche> getM_manches() {
        return m_manches;
    }

    /**
     *
     * @param m_manches
     */
    public void setM_manches(List<Manche> m_manches) {
        this.m_manches = m_manches;
    }

    /**
     *
     * @return
     */
    public Joueur getM_joueurA() {
        return m_joueurA;
    }

    /**
     *
     * @param m_joueurA
     */
    public void setM_joueurA(Joueur m_joueurA) {
        this.m_joueurA = m_joueurA;
    }

    /**
     *
     * @return
     */
    public Joueur getM_joueurB() {
        return m_joueurB;
    }

    /**
     *
     * @param m_joueurB
     */
    public void setM_joueurB(Joueur m_joueurB) {
        this.m_joueurB = m_joueurB;
    }

    /**
     *
     * @return
     */
    public boolean isM_over() {
        return m_over;
    }

    /**
     *
     * @param m_over
     */
    public void setM_over(boolean m_over) {
        this.m_over = m_over;
    }

    /**
     * Constructeur de la partie
     */
    public Partie() {
        m_nbManche = 0;
        m_manches = new ArrayList();
        m_joueurA = new Joueur();
        m_joueurB = new Joueur();
    }

    /**
     *
     * @return
     */
    public int getNbManche() {
        return m_nbManche;
    }

    /**
     *
     * @param m_nbManche
     */
    public void setNbManche(int m_nbManche) {
        this.m_nbManche = m_nbManche;
    }

    /**
     *
     * @return
     */
    public List<Manche> getManches() {
        return m_manches;
    }

    /**
     *
     * @param m_manches
     */
    public void setManches(List<Manche> m_manches) {
        this.m_manches = m_manches;
    }
    
    /**
     * Cette fonction joue une manche avec un codeur et un décodeur
     * @param codeur
     * @param decodeur
     */
    public void playManche(Joueur codeur, Joueur decodeur) {
        
        //On crée une manche
        Manche m = new Manche(codeur, decodeur, new Plateau());
        
        //On demande au codeur le code qu'il souhaite mettre en place
        m.nouveauCode();
        
        //On lance la recherche du décodeur jusqu'à ce qu'il trouve le bon code OU que 12 tours se soient passés
        while(!m.nouveauTour()  && (m.getPlateauManche().getIndex() < 12)) {
        }
        
        //Si on est sortis de la boucle et qu'on a pas dépassé le  douzième tour
        if (m.getPlateauManche().getIndex() < 12) {
            //On rajoute le nombre de tours en points au codeur
            codeur.setScore(codeur.getScore() + (m.getPlateauManche().getIndex() + 1));
        }
        //Si on dépasse 12 tours, on met un max de points parce que le codeur est un boss
        else {
            codeur.setScore(codeur.getScore() + 15);
        }
        
        m_manches.add(m);
        
    }

    /**
     * Fonction qui demande aux deux joueurs tour à tour si ils veulent arrêter la partie. Si ils le souhaitent
     * tous les deux, le paramètre m_over est passé à true.
     */
    public void askIfPartieOver() {
        boolean responseOk = false;
        while (!responseOk) {
            System.out.println("Joueur A, souhaitez-vous arrêter la partie (taper 1 pour Oui et 2 pour Non) ?");
            Scanner sc = new Scanner(System.in);
            int choix = 0;
            try {
                choix = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Il faut entrer une entier");
            }
            if (choix == 1) {
                //Si c'est bon, on propose au joueur 2
                boolean responseOk2 = false;
                while (!responseOk2) {
                    System.out.println("Joueur B, souhaitez-vous arrêter la partie (taper 1 pour Oui et 2 pour Non) ?");
                    sc = new Scanner(System.in);
                    choix = 0;
                    try {
                        choix = sc.nextInt();
                    } catch (Exception e) {
                        System.out.println("Il faut entrer une entier");
                    }
                    if (choix == 1) {
                        //Si c'est bon, on propose au joueur 2
                        System.out.println("La partie s'arrête donc maintenant.");
                        setM_over(true);
                        responseOk2 = true;
                    } else if (choix == 2) {
                        //La partie continue
                        System.out.println("La partie continue donc.");
                        responseOk2 = true;
                    } else {
                        System.out.println("L'entier entré n'est pas valide");
                    }
                }
                responseOk = true;
            } else if (choix == 2) {
                //La partie continue
                System.out.println("La partie continue donc.");
                responseOk = true;
            } else {
                System.out.println("L'entier entré n'est pas valide");
            }
        }
    }
    
    /**
     * Cette fonction affiche dans le terminal le gagnant dans le cas où il y en a un, elle annonce un match nul sinon.
     */
    public void printWinner() {
        if (m_joueurA.getScore() < m_joueurB.getScore()) {
            System.out.println("Le joueur B a gagné.");
            System.out.println("Félicitations à lui !");
        }
        else if (m_joueurA.getScore() > m_joueurB.getScore()) {
            System.out.println("Le joueur A a gagné.");
            System.out.println("Félicitations à lui !");
        }
        else {
            System.out.println("La partie se termine donc sur un match nul.");
            System.out.println("Félicitations à tous les deux.");
        }
    }

}
