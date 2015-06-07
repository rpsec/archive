package groovy

/**
 * Created by IntelliJ IDEA.
 * User: ryanp
 * Date: 1/9/13
 * Time: 9:26 AM
 * To change this template use File | Settings | File Templates.
 */
class insertionSort {

    def insertionsort() {

        def A = [5,4,2,31,122,1,90,300,1000,1020]
        def n = A.size()
        for (def i=1;i<=n-1;i++) {
            insert(A, i, A[i])
        }

        println(A)
//        for (i in n) {
//            println(i)
//        }
    }

    def insert(A, pos, value) {
        def i = pos -1
        while (i >= 0 && A[i]>value) {
            A[i+1] = A[i]
            i = i -1
        }
        A[i+1] = value
    }
}
