package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		final String x = "";
		int i = 0;
		int j = 1;
		int count = 0;
		char a = 0;
		char b = 0;
		char c = System.in.read();
		while (c != '\n')
		{
			x = tangible.StringFunctions.changeCharacter(x, i++, c);
			c = System.in.read();
		}
		count = i + 1;
		a = x.charAt(0);
		for (i = 0;i < count;i++)
		{
			if (x.charAt(i) != a)
			{
				b = x.charAt(i);
				break;
			}
		}
		int boy = 0;
		while (x.charAt(0) != '\0')
		{
			for (i = 0;i < count;i++)
			{
				if (x.charAt(i) == a)
				{
					boy = i;
					continue;
				}
				else if (x.charAt(i) == '\0')
				{
					continue;
				}
				else
				{
					System.out.print(boy);
					System.out.print(" ");
					System.out.print(i);
					System.out.print("\n");
					x = tangible.StringFunctions.changeCharacter(x, boy, '\0');
					x = tangible.StringFunctions.changeCharacter(x, i, '\0');
					break;
				}
				/*for(j=i+1;j<count;j++)
				{
				if(x[j]==a)
				break;
				else if(x[j]=='\0')
				continue;
				else if(x[j]==b)
				{
				cout<<boy<<' '<<j<<'\n';
				x[i]='\0';
				x[j]='\0';
				break;
				}
				}*/
			}
		}
			return 0;
	}
}

