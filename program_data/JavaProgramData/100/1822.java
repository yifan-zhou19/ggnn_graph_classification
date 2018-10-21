package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int[] a = new int[256];
	int i;
	int j = 0;
	String str = new String(new char[256]);
	for (i = 0;i < 256;i++)
	{
		a[i] = 0;
	}
	str = new Scanner(System.in).nextLine();

	i = 0;
	while (str.charAt(i) != null)
	{
	  a[str.charAt(i++)]++;
	}
		for (i = 'A';i <= 'Z';i++)
		{
	   if (a[i] != 0)
	   {
		 System.out.printf("%c=%d\n",i,a[i]);
		 j++;
	   }
		}
	   for (i = 'a';i <= 'z';i++)
	   {
	   if (a[i] != 0)
	   {
		 System.out.printf("%c=%d\n",i,a[i]);
		 j++;
	   }
	   }
	   if (j == 0)
	   {
	   System.out.print("No");
	   }
	return 0;
	}

}
