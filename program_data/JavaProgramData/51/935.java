package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int lenth;
		int[] c = new int[500];
		int max = 0;
		int j;
		int t;
		String a = new String(new char[500]);
		String b = new String(new char[6]);
		String d = new String(new char[6]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		a = new Scanner(System.in).nextLine();
		lenth = a.length();
		b = tangible.StringFunctions.changeCharacter(b, n, '\0');
		d = tangible.StringFunctions.changeCharacter(d, n, '\0');
		for (i = 0;i < lenth - n;i++)
		{
			for (t = i;t < n + i;t++)
			{
				b = tangible.StringFunctions.changeCharacter(b, t - i, a.charAt(t));
			}
			c[i]++;
			for (j = i + 1;j < lenth + 1 - n;j++)
			{
				for (t = j;t < n + j;t++)
				{
				   d = tangible.StringFunctions.changeCharacter(d, t - j, a.charAt(t));
				}
				if (strcmp(d,b) == 0)
				{
					c[i]++;
				}

			}
														// printf(" %s %d \n",b,c[i]);
		}
		for (i = 0;i < lenth - n;i++)
		{
			if (c[i] > max)
			{
				max = c[i];
			}
											   //printf(" %d \n",c[i]);
		}
	  if (max > 1)
	  { // printf("  %d  \n",max);
		System.out.printf("%d\n",max);
		  for (i = 0;i < lenth - n;i++)
		  {
			if (c[i] == max)
			{
				for (j = i;j < n + i;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
		  }
	  }
	  else
	  {
		  System.out.print("NO");
	  }
	}
}

