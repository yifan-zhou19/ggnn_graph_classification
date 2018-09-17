package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		char k;
		int[] b = new int[300];
		int i;
		int e = 0;
		a = new Scanner(System.in).nextLine();
		for (k = 'A';k <= 'Z';k++)
		{
			 for (i = 0;a.charAt(i) != '\0';i++)
			 {
				  if (a.charAt(i) == k)
				  {
				  b[k]++;
				  }
			 }
				  if (b[k] != 0)
				  {
				  System.out.printf("%c=%d\n",k,b[k]);
				  }
		}
				  for (k = 'a';k <= 'z';k++)
				  {
			 for (i = 0;a.charAt(i) != '\0';i++)
			 {
				  if (a.charAt(i) == k)
				  {
				  b[k]++;
				  }
			 }
				  if (b[k] != 0)
				  {
				  System.out.printf("%c=%d\n",k,b[k]);
				  }
				  }
		for (i = 0;i < 300;i++)
		{
			if (b[i] != 0)
			{
			e = 1;
			}
		}
			if (e == 0)
			{
			System.out.print("No");
			}
			return 0;
	}


}
