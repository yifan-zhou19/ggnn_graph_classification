package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   String str = new String(new char[100000]);
	   int[] a = new int[300];
	   int i;
	   int j;
	   int k;
	   str = new Scanner(System.in).nextLine();
	   i = 0;
	   for (j = 0;str.charAt(j) != '\0';j++)
	   {
			 if (str.charAt(j) != ' ')
			 {
			 a[i]++;
			 }
			 if (str.charAt(j) == ' ' && str.charAt(j + 1) != ' ' && str.charAt(j + 1) != '\0')
			 {
			 i++;
			 }
	   }
	   for (k = 0;k < i;k++)
	   {
	   System.out.printf("%d,",a[k]);
	   }
	   System.out.printf("%d",a[i]);
	}
}
