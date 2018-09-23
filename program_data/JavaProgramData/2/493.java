package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on the parameter 'p', so pointers on this parameter are left unchanged:
	public static void init(int[] a, int[] f, String[][] * p, int m)
	{
		int i;

	String e = new String(new char[432]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * pp;
	int r;
		for (i = 1;i <= m;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
			p[i] = (char[30])malloc(sizeof(char[30]));

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				f[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p[i] = tempVar2;
			}
			System.in.read();
			pp = p[i];
			while (*pp != '\0')
			{
				a[*pp]++;
			 pp++;
			}

		}

	}
	public static char pro(int[] a)
	{
		char c;
		char max;
		char g;
		max = -333;
		for (c = 'A';c <= 'Z';c++)
		{

		if (a[c] > max)
		{
			max = a[c];
			g = c;
		}
		}
		return g;
	}
	public static void print(int[] f, String[][] p, int m, char c)
	{
		int i;
			for (i = 1;i <= m;i++)
			{
				if (tangible.StringFunctions.strChr(p[i],c) != null)
				{
					System.out.printf("%d\n",f[i]);
				}
			}
	}
	public static int Main()
	{
		int m;
		int k;
		int[] a = new int[343];
			int[] f = new int[lll];
			String[][] p = new String[30][lll];
			char max;
		//freopen("tt.in","r",stdin);
		//freopen("tt.out","w",stdout);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		init(a, f, p, m);
		max = pro(a);
		System.out.printf("%c\n%d\n",max,a[max]);

		print(f, p, m, max);

	}

}

