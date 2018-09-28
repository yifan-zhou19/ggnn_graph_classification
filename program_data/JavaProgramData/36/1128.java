package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int temp = 0;
		int c;
		int e;
		int t;
		String a = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		for (j = 0;j < a.length();j++)
		{
			if (a.charAt(j) == ' ')
			{
				c = j;
			}
			else
			{
				;
			}
		}
		/*printf("%d\n",c);*/
		if (a.length() != (2 * c + 1))
		{
			System.out.print("NO");
		}
		else
		{
			for (i = 0;i < c - 1;i++)
			{
				for (j = 0;j < (c - 1 - i);j++)
				{
					if (a.charAt(j + c + 1) > a.charAt(j + 2 + c))
					{
						t = a.charAt(j + c + 1);
						a = tangible.StringFunctions.changeCharacter(a, j + c + 1, a.charAt(j + c + 2));
						a = tangible.StringFunctions.changeCharacter(a, j + 2 + c, t);
					}
				}
			}
			/*for(i=c+1;i<(strlen(a)-1);i++)
			{
				for(j=c+1;j<(strlen(a)-1-i);j++)
				{
					if(a[j]>a[j+1])
					{
						t=a[j];
						a[j]=a[j+1];
						a[j+1]=t;
					}
				}
			}*/
			/*for(i=c+1;i<(2*c+1);i++)
			{printf("$%c",a[i]);}
			for(i=c+1;i<(2*c+1);i++)
			{printf("$%c",a[i]);}*/
			for (i = 0;i < c - 1;i++)
			{
				for (j = 0;j < c - i - 1;j++)
				{
					if (a.charAt(j) > a.charAt(j + 1))
					{
						e = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						a = tangible.StringFunctions.changeCharacter(a, j + 1, e);
					}
				}

			} /*for(i=0;i<c;i++)
			{
				printf("@%c",a[i]);}*/

			for (i = 0,j = c + 1;i < c,j < a.length();i++,j++)
			{
				if (a.charAt(i) == a.charAt(j))
				{
					temp++;
				}
			}
			if (temp == c)
			{
			System.out.print("YES");
			}
			else
			{
				System.out.print("NO");
			}
		}

	}

}

