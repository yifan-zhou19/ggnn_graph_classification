package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int i;
		int j;
		int l;
		String aa = new String(new char[100]);
		char[][] bb = new char[100][100];
		aa = new Scanner(System.in).nextLine();
		i = 0;
		j = 0;
		l = 0;
		while (aa.charAt(i) != '\0')
		{
		  if (aa.charAt(i) != ' ')
		  {
			  bb[j][l] = aa.charAt(i);
				 l++;
		  }
		  else
		  {
			 j++;
			 l = 0;
		  }
			 i++;
		}
			 System.out.print(bb[j]);
			 for (k = j - 1;k >= 0;k--)
			 {
						System.out.print(" ");
						System.out.print(bb[k]);
			 }
					return 0;
	}
}
