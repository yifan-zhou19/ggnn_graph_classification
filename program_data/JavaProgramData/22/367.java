package <missing>;

public class GlobalMembers
{
	public static String str = new String(new char[1500]);
	public static void Main()
	{
	  int l;
	  int i;
	  int j = 0;
	  int s = 0;
	  int k;
	  int[] a = new int[300];
	  str = new Scanner(System.in).nextLine();
	  l = str.length();
	  for (i = 0;i < l;i++)
	  {
		  if (str.charAt(i) == ',')
		  {
			  s = 0;
		  }
		   else
		   {
			   s = s * 10 + str.charAt(i) - '0';
		   }
			if (str.charAt(i + 1) == ',' || i == (l - 1))
			{
				a[j] = s;
				j++;
			}
	  }
	  for (i = 0;i < j;i++)
	  {
	  for (k = i + 1;k < j;k++)
	  {
		  if (a[i] < a[k])
		  {
			  s = a[i];
			  a[i] = a[k];
			  a[k] = s;
		  }
	  }
	  }
	   if (a[j - 1] == a[0])
	   {
		   System.out.print("No");
	   }
	   else
	   {
		   for (i = 1;i < j;i++)
		   {
		  if (a[i] != a[0])
		  {
			  System.out.printf("%d\n",a[i]);
			  break;
		  }

		   }
	   }
	}
}
