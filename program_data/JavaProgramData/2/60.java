public class book
{
	public int n;
  public book next;
}
public class au
{
	public char n;
	public int s;
	public book p;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;
		int[][] a = new int[100][1100];
		int max = 0;
		int[] b = new int[100];
		String s = new String(new char[30]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (l = 1;l <= n;l++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				s = tempVar3.charAt(0);
			}
			for (i = 0;s.charAt(i) != '\0';i++)
			{
				b[s.charAt(i)]++;
				a[s.charAt(i)][b[s.charAt(i)]] = j;
			if (b[s.charAt(i)] > b[max])
			{
				max = s.charAt(i);
			}
			}
		}
		System.out.printf("%c\n",(char)max);
		System.out.printf("%d\n",b[max]);
		for (i = 1;i <= b[max];i++)
		{
			System.out.printf("%d\n",a[max][i]);
		}

	}
}

