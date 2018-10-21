package <missing>;

public class GlobalMembers
{
	///#include<math.h>
	/*int  a[100][100],i,n,j;
	int f(int i,int j)
	{
		if(i==n-1&&j==n-1) return 1;
		else {
	
	*/



	public static void Main()
	{

		final String a = "\0";
		int[] b = new int[100];
		int[] c = new int[100];
		int n = 0;
		int r = 0;
		int[] d = new int[100];
		int i = 0;
		int j = 0;
		int k = 0;
		int max = 0;
		int min = 180;
		int a1 = 90;
		int s = 0;
		int a2 = 90;
		int t = 0;

		a = new Scanner(System.in).nextLine();

		t = a.length(); //????????

	  for (i = 0;i < t;i++)
	  {
		  if (a.charAt(i) >= 'A' && a.charAt(i) <= 'z' || a.charAt(i) >= '0' && a.charAt(i) <= '9')
		  {
			  b[j]++; //??????????
		  }
		  else if (a.charAt(i) != '.')
		  {
			  j++; //????????
		  }

	  }

	j++;


	  for (k = 0;k < j;k++)
	  {

		  if (b[k] > max)
		  {
			  max = b[k];
		  }
	  }
	   for (t = 0;t < j;t++)
	   {
		   if (b[t] == max)
		   {
			   a1 = t;
			   break;
			   //??????????
		   }
	   }
		 for (k = 0;k < j;k++)
		 {
		   if (b[k] < min)
		   {
			  min = b[k];
		   }
		 }
		for (t = 0;t < j;t++)
		{
		   if (b[t] == min)
		   {
			   a2 = t;
			   break;

		   } //???????????
		}




		for (t = 0;t < a1;t++)
		{
			s += b[t] + 1;
		}
	//	printf("%d %d %d",max,b[a1],s);
		for (t = s;t < s + b[a1];t++)
		{
			System.out.printf("%c",a.charAt(t));
		}
			  System.out.print("\n"); //break;



	s = 0;
		for (t = 0;t < a2;t++)
		{
			s += b[t] + 1;
		}
	//	printf("%d %d %d ",min,b[a2],s);

			for (t = s;t < s + b[a2];t++)
			{
		System.out.printf("%c",a.charAt(t));
			}
		System.out.print("\n");
		//break;



	}


}
