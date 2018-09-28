public class monkey
{
	public int x;
	public monkey l;
	public monkey r;
}

package <missing>;

public class GlobalMembers
{
	public static int guowang(int n,int m)
	{
		int wang;
		int i;
		int j;
		monkey p;
		monkey s;
		monkey t;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (monkey)malloc(n * sizeof(monkey));
		for (i = 1;i < n - 1;i++)
		{
			(p + i).x = i + 1;
			(p + i).l = p + i - 1;
			(p + i).r = p + i + 1;
		}
		p.x = 1;
		(p + n - 1).x = n;
		p.l = p + n - 1;
		p.r = p + 1;
		(p + n - 1).l = p + n - 2;
		(p + n - 1).r = p;
		for (i = 1;i < n;i++)
		{
			s = p;
			for (j = 1;j < m;j++)
			{
				s = s.r;
			}

			s.l.r = s.r;

			s.r.l = s.l;
			p = s.r;
		}
		wang = p.x;
		return wang;
	}


	public static int Main()
	{
		int[] n = new int[100];
		int[] m = new int[100];
		int l;
		int[] a = new int[100];
		int i;
		for (l = 0;;l++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[l] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m[l] = Integer.parseInt(tempVar2);
			}
			if (n[l] == 0 && m[l] == 0)
			{
				break;
			}
			else
			{
				a[l] = guowang(n[l], m[l]);
			}
		}

		for (i = 0;i < l;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}
}

