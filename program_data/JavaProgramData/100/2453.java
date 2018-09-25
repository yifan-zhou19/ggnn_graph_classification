package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[500]);
		String c = new String(new char[500]);
		char p;
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int o;
		int[] y = new int[1005];
		int[] a = new int[1005];
		int[] b = new int[10005];
		int e;
		e = 0;
		n = 0;
		k = 0;
		int h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = tempVar.charAt(0);
		}
		for (i = 0;s.charAt(i) != '\0';i++)
		{
			n = i;
		}
		for (i = 0;i <= 1003;i++)
		{
			y[i] = a[i] = b[i] = 0;
		}

		for (i = 0;s.charAt(i) != '\0';i++)
		{
			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))

			{
				a[i]++;
				for (l = 0;l <= n;l++)
				{
					if (l < i && s.charAt(i) == s.charAt(l))
					{
						b[i]++;
					}

				}
				if (b[i] > 0)


				{
					a[i]--;
				}



				else
				{

					for (l = 0;l <= n;l++)

					{
						if (l > i && s.charAt(i) == s.charAt(l))
						{

							a[i]++;
						}
					}
				}



			}


		}









		for (i = 0;i <= n;i++)
		{
			if (a[i] != 0)
			{
				y[k] = a[i];
				c = tangible.StringFunctions.changeCharacter(c, k, s.charAt(i));
				k = k + 1;
			}

		}

			for (j = 0;j < k - 1;j++)
			{
				for (i = 0;i < k - 1 - j;i++)
				{
					if (c.charAt(i) > c.charAt(i + 1))
					{
					o = y[i];
					y[i] = y[i + 1];
					y[i + 1] = o;
				p = c.charAt(i);
				c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(i + 1));
				c = tangible.StringFunctions.changeCharacter(c, i + 1, p);
					}
				}
			}





		if (k == 0)
		{
			System.out.print("No");
		}
		for (i = 0;i < k;i++)
		{

				System.out.printf("%c=%d\n",c.charAt(i),y[i]);
		}


	}
}

