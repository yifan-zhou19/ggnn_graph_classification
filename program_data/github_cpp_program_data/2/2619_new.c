#include <iostream>
 #include <fstream>
 using namespace::std;


 int bubblesort( int arrayf[], int size);

  int bubblesort( int arrayf[], int size)
  {
  int temp;
  int i=0;



  bool swapped = false;

   if (arrayf[i]>arrayf[i+1])
   {

    swapped = true;

   temp = arrayf[i];
   arrayf[i] = arrayf[i+1];
   arrayf[i+1] = temp;
   bubblesort(arrayf,0);

   }
   else {
        if (arrayf[i]>arrayf[size-1])
        {
         bubblesort(arrayf, size++);
        }
        }

}
int main()
{

     int j = 15;
    int arr[15]={4,7,3,9,5,1,2,6};
    /*
//opens file
  ifstream myfile ("integers.txt");

  if (myfile.is_open())
  {
    while ( myfile.good() )
    {
        cout<<"unsorted";
          for(j=0;j<=14;j++){
        myfile>>arr[j];

      cout << arr[j] << endl;

}*/
     bubblesort(arr, j);
     cout<<arr[j];
    // myfile.close();
     getchar();
     return 0;

     }
