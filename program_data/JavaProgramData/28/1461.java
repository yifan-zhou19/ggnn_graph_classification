package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		String s = new String(new char[30000]);
		int[] t = new int[300];
		int[] w = new int[300];
		int k = 1;
		int n = 0;
		int ww;
		int f = 1;
	s = new Scanner(System.in).nextLine();
	t[0] = 0;

	for (int d = 0;d < s.length();d++)
	{
		if (s.charAt(d) == ' ')
		{
			f = 0;
			break;
		}
	}

	if (f == 0)
	{
	for (int i = 1;i < s.length();i++)
	{
			if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ')
			{
				t[k] = i;
				k++;
			}
	}


			w[k - 1] = s.length() - 1;
			for (int j = 0;j < s.length();j++)
			{
			if (s.charAt(j) != ' ' && s.charAt(j + 1) == ' ')
			{
				w[n] = j;
				n++;
			}
			}

	int[] chazhi = new int[k];
	for (int o = 0;o < k;o++)
	{
		   chazhi[o] = w[o] - t[o] + 1;
	}

	   for (int oo = 0;oo < k - 1;oo++)
	   {
		   System.out.printf("%d,",chazhi[oo]);
		   ww = oo;
	   }
	   System.out.printf("%d",chazhi[ww + 1]);

	}
	  if (f == 1)
	  {
		  System.out.printf("%d",s.length());
	  }
		return 0;
	}

}
