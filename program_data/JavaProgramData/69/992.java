package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String aa = new String(new char[300]);
		String bb = new String(new char[300]);
		String cc = new String(new char[300]);
		aa = new Scanner(System.in).nextLine();
		bb = new Scanner(System.in).nextLine();
		int i;
		int j;
		int k;
		int l;
		int x;
		int g;
		i = 0;
		j = 0;
		while (aa.charAt(i) != '\0')
		{
		i++;
		}
		while (bb.charAt(j) != '\0')
		{
		j++;
		}
		if (i < j)
		{
		k = j;
		}
		else
		{
			k = i;
		}
		g = 0;
		for (l = 0;l <= k;l++)
		{
		 x = 0;
		 if (i > l && j > l)
		 {
		  x = (int)(aa.charAt(i - l - 1) + bb.charAt(j - l - 1) - 96);
		 }
		 else
		 {
			  if (i > l)
			  {
			  x = aa.charAt(i - l - 1) - 48;
			  }
			  if (j > l)
			  {
			  x = bb.charAt(j - l - 1) - 48;
			  }
		 }
		  x = x + g;
		  if (x > 9)
		  {
		  x = x - 10;
		  g = 1;
		  }
		  else
		  {
			  g = 0;
		  }
		  cc = tangible.StringFunctions.changeCharacter(cc, k - l, x + 48);
		}
		  j = 0;
		  while (aa.charAt(j) == 48)
		  {
		  j++;
		  }
		  if (j == k)
		  {
		  System.out.print(0);
		  }
		  else
		  {
		  if (cc.charAt(j) == 48)
		  {
		   j++;
		  }
		  for (i = j;i <= k;i++)
		  {
		  System.out.print(cc.charAt(i));
		  }
		  }


		return 0;
	}

}

