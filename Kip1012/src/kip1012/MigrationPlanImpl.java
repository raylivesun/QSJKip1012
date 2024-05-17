/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kip1012;



public abstract class MigrationPlanImpl  {

    private static final long serialVersionUID = 1L;

    public MigrationPlanImpl(Object target, long when, int id, int x, int y, int key, int modifiers, Object arg) {
        target.notifyAll();
    }
   
}
