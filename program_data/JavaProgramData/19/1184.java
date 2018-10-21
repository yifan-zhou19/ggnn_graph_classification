package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int l;
	int k;
	int m = 0;
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	String c = new String(new char[100]);
	a = new Scanner(System.in).nextLine();
	b = new Scanner(System.in).nextLine();
	c = new Scanner(System.in).nextLine();
	l = a.length();
	String[] p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	p = (String)malloc(500 * sizeof(String));
	for (i = 0;i <= 499;i++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p[i] = (String)malloc(500 * (Character.SIZE / Byte.SIZE));
	}
		for (k = 0, i = 0;k <= l - 1 && i <= 499;i++)
		{
			for (j = 0;j <= 499;j++)
			{
				if (a.charAt(k) != ' ' && a.charAt(k) != '\0')
				{
					p[i][j] = a.charAt(k);
						k++;
				}
				else
				{
					k++;
					p[i][j] = '\0';
					m++;
					break;
				}
			}
		}
		for (i = 0;i <= m - 1;i++)
		{
			if (strcmp(p[i],b) == 0)
			{
				p[i] = c;
			}
		}
	for (i = 0;i <= m - 2;i++)
	{
	System.out.printf("%s ",p[i]);
	}
	System.out.printf("%s",p[m - 1]);
	}
}
