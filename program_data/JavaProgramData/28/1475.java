package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[10000]);
		char[][] b = new char[300][100];
		int i;
		int n;
		int m;
		int j = 0;
		int k = 0;
		int tag = 0;
		int[] a = new int[300];
		s = new Scanner(System.in).nextLine();
		n = s.length();
		for (i = 0;i < n;i++)
		{
			if (s.charAt(i) != ' ')
			{
				b[j][k] = s.charAt(i);
				k++;
			}
			else if (s.charAt(i) == ' ')
			{
				b[j][k] = '\0';
				j++;
				k = 0;
			}
		}
		tag = 0;
		for (m = 0;m < j + 1;m++)
		{
			a[m] = String.valueOf(b[m]).length();
			if (a[m] != 0)
			{
				  if (m == 0)
				  {
					   System.out.printf("%d",a[m]);
					   tag = 1;
				  }
				  else
				  {
					   if (tag == 0)
					   {
							System.out.printf("%d",a[m]);
							tag = 1;
					   }
					   else
					   {
						   System.out.printf(",%d",a[m]);
					   }
				  }
			}
		}
		return 0;
	}
}
