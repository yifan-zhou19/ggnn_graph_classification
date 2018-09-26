package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	   String str = new String(new char[1000]);
	   char c;
	   int i = 0; //??????
	   int j = 0;
	   int k;
	   int t;
	   int[] a = new int[300];
	   str = new Scanner(System.in).nextLine();

	   for (i = 0;str.charAt(i) != '\0';i++)
	   {

		  if (str.charAt(i) != ' ')
		  {
		  a[j]++;
		  }
		  else if (str.charAt(i) == ' ' && str.charAt(i + 1) != ' ')
		  {
		  j++;
		  }
	   }
	   System.out.printf("%d",a[0]);
	   for (i = 1;i <= j;i++)
	   {
		System.out.printf(",%d",a[i]);
	   }
	}
}
