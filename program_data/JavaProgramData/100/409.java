package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[300]);
		final String w = "abcdefghijklmnopqrstuvwxyz";
		int i;
		int[] n = new int[27];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		for (i = 1;i < 27;i++)
		{
			n[i] = 0;
		}

		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) == 'a')
			{
				n[1]++;
			}
			if (a.charAt(i) == 'b')
			{
				n[2]++;
			}
			if (a.charAt(i) == 'c')
			{
				n[3]++;
			}
			if (a.charAt(i) == 'd')
			{
				n[4]++;
			}
			  if (a.charAt(i) == 'e')
			  {
				n[5]++;
			  }
			if (a.charAt(i) == 'f')
			{
				n[6]++;
			}
			if (a.charAt(i) == 'g')
			{
				n[7]++;
			}
			if (a.charAt(i) == 'h')
			{
				n[8]++;
			}
			if (a.charAt(i) == 'i')
			{
				n[9]++;
			}
			if (a.charAt(i) == 'j')
			{
				n[10]++;
			}
			if (a.charAt(i) == 'k')
			{
				n[11]++;
			}
			if (a.charAt(i) == 'l')
			{
				n[12]++;
			}
			if (a.charAt(i) == 'm')
			{
				n[13]++;
			}
			if (a.charAt(i) == 'n')
			{
				n[14]++;
			}
			if (a.charAt(i) == 'o')
			{
				n[15]++;
			}
			if (a.charAt(i) == 'p')
			{
				n[16]++;
			}
			if (a.charAt(i) == 'q')
			{
				n[17]++;
			}
			if (a.charAt(i) == 'r')
			{
				n[18]++;
			}
			if (a.charAt(i) == 's')
			{
				n[19]++;
			}
			if (a.charAt(i) == 't')
			{
				n[20]++;
			}
			if (a.charAt(i) == 'u')
			{
				n[21]++;
			}
			if (a.charAt(i) == 'v')
			{
				n[22]++;
			}
			if (a.charAt(i) == 'w')
			{
				n[23]++;
			}
			if (a.charAt(i) == 'x')
			{
				n[24]++;
			}
			if (a.charAt(i) == 'y')
			{
				n[25]++;
			}
			if (a.charAt(i) == 'z')
			{
				n[26]++;
			}
		}
			   int flag = 0;
		  for (i = 1;i <= 26;i++)
		  {
			if (n[i] >= 1)
			{

				System.out.printf("%c=%d",w.charAt(i - 1),n[i]);
						   System.out.print("\n");
							 flag = 1;
			}
		  }
	if (flag == 0)
	{
		   System.out.print("No\n");
	}

		return 0;



	}

}

