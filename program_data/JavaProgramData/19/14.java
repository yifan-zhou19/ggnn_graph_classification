package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[PI]);
		String b = new String(new char[PI]);
		String sun = new String(new char[PI]);
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sum
	//	{
	//		char tmp[20];
	//	};
		sum[] s = tangible.Arrays.initializeWithDefaultsumInstances(100);
		sun = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int len;
		int j;
		len = sun.length();
		sun = tangible.StringFunctions.changeCharacter(sun, len + 1, ' ');

		int k = 0;
		int n = 0;
		for (i = 0;i <= len + 1;i++)
		{
			if (sun.charAt(i) == ' ')
			{
				n++;
				int t;
				t = i - k;
				for (j = 0;j < k;j++)
				{

					s[n].tmp[j] = sun.charAt(t);
					t++;
				}
				s[n].tmp[j] = '\0';
				k = 0;
			}
			else
			{
				k++;
			}
		}
		s[n].tmp[j - 1] = '\0';
		for (i = 1;i <= n;i++)
		{
			if (strcmp(s[i].tmp,a) == 0)
			{
				s[i].tmp = b;
			}
			if (i != n)
			{
				System.out.printf("%s ",s[i].tmp);
			}
			else
			{
				System.out.printf("%s",s[i].tmp);
			}
		}

		return 0;
	}
}

