package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		char w[20];
	//	}
	//	sen[40];
		int i;
		int j;
		for (i = 0;i < 40;i++)
		{
			for (j = 0;j < 20;j++)
			{
				sen[i].w[j] = '\0';
			}
		}
		String a = new String(new char[100]);
		String from = new String(new char[20]);
		String to = new String(new char[20]);
		a = new Scanner(System.in).nextLine();
		from = new Scanner(System.in).nextLine();

		to = new Scanner(System.in).nextLine();
		int e;
		e = to.length();
		to = tangible.StringFunctions.changeCharacter(to, e, ' ');
		to = tangible.StringFunctions.changeCharacter(to, e+1, '\0');
		int b;
		b = a.length();
		int k;
		int p;
		int q;
		int num = 0;
		for (i = 0,j = 0;i <= b;i++)
		{
			int m;
			if (a.charAt(i) == ' ')
			{
				for (k = i;;k--)
				{
					if (k == 0)
					{
						m = k;
						break;
					}
					else if (a.charAt(k - 1) == ' ')
					{
						m = k;
						break;
					}
				}
				for (p = m,q = 0;p < i;p++,q++)
				{
					sen[j].w[q] = a.charAt(p);
					sen[j].w[q + 1] = ' ';
				}

				j++;
				num++;
			}
			else if (i == b)
			{
				for (k = i;;k--)
				{
					if (k == 0)
					{
						m = k;
						break;
					}
					else if (a.charAt(k - 1) == ' ')
					{
						m = k;
						break;
					}
				}
				for (p = m,q = 0;p < i;p++,q++)
				{
					sen[j].w[q] = a.charAt(p);
					sen[j].w[q + 1] = ' ';
				}
				j++;
				num++;
			}
		}
		int judge;
		for (i = 0;i <= num;i++)
		{
			judge = 1;
			for (j = 0;from.charAt(j) != '\0';j++)
			{
				if (sen[i].w[j] != from.charAt(j))
				{
					judge = 0;
					break;
				}
			}
			if (judge == 1)
			{
				sen[i].w = to;

			}
		}
		for (i = 0;;i++)
		{
			if (sen[num - 1].w[i] == ' ')
			{
				sen[num - 1].w[i] = '\0';
				break;
			}
		}



		for (i = 0;i <= num + 1;i++)
		{
			System.out.printf("%s",sen[i].w);
		}
		return 0;
	}







}

