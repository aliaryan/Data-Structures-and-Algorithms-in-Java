public class Main {

    public static void main(String[] args) {
        int[] arr = {16, 19, 15, 2, 5, 3, 7};
        mergesort(arr,0, arr.length);

        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }

    }
    public static void mergesort(int arr[],int start, int end)
    {
        if(end-start<2)
            return;
        int mid=(start+end)/2;
        mergesort(arr,start,mid);
        mergesort(arr,mid,end);
        merge(arr,start,mid,end);
    }
    public static void merge(int arr[],int start,int mid,int end)
    {
        if(arr[mid-1]<arr[mid])
            return;
        int temparr[]=new int[end-start];
        int tempindex=0;
        int i=start;
        int j=mid;
        while(i< mid && j<end)
        {
            temparr[tempindex++]=arr[i]<arr[j]?arr[i++]:arr[j++];
        }
        System.arraycopy(arr,start,arr,start+tempindex,mid-i);
        System.arraycopy(temparr,0,arr,start,tempindex);

    }

}
