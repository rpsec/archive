package groovy

import groovy.sql.Sql

/**
 * Created by IntelliJ IDEA.
 * User: ryanp
 * Date: 1/11/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
class medianSort {

    def A =[5,10,9,3,4,44]
    def n=A.size()
    def mid


    def sort() {
        medianSort(A,0,n-1)
    }

    def medianSort(A,left,right) {
       if (left<right) {
           mid = (right+left)/2
           for (i=left;i<=mid-1;i++) {
               if (A[i]>A[mid]) {

               }
           }

       }
    }
}
