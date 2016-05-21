/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.utalca.proyectoU2;

/**
 *
 * @author Diego
 */
class Nodo<T>
{
    private T item;
    private Nodo nodoIzq;
    private Nodo nodoDer;

    public Nodo(T item, Nodo nodoIzq, Nodo nodoDer)
    {
        this.item = item;
        this.nodoIzq = nodoIzq;
        this.nodoDer = nodoDer;
    } 

   public static void imprimir()
   {
       
   }

    Nodo()
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
