package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[101]);
		String s = new String(new char[101]);
		char temp;
		int i;
		int j;
		int k;
		int t;
		int y;
		c = new Scanner(System.in).nextLine();
		for (i = 0;;i++)
		{
			if (c.charAt(i) == '\0')
			{
				break;
			}
		}
		for (j = 0;j < i;j++)
		{
			s = tangible.StringFunctions.changeCharacter(s, j, c.charAt(i - 1 - j));
		}
		s = tangible.StringFunctions.changeCharacter(s, j, '\0');
		//printf("%s\n",s);
		j = -1;
		k = -1;
		for (i = 0;;i++)
		{
			if (s.charAt(i) == ' ' || s.charAt(i) == '\0')
			{
				j = k;
				k = i;
				//printf("%d %d\n",j,k);
				for (t = j + 1,y = k - 1;y > t;t++,y--)
				{
					//printf("s[%d]='%c',s[%d]='%c'\n",t,s[t],y,s[y]);
					temp = s.charAt(y);
					s = tangible.StringFunctions.changeCharacter(s, y, s.charAt(t));
					s = tangible.StringFunctions.changeCharacter(s, t, temp);
				}
			}
			if (s.charAt(i) == '\0')
			{
				break;
			}
		}
		System.out.printf("%s\n",s);
	}

}

