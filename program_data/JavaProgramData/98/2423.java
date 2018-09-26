public class sz
{
	public String word = new String(new char[41]);
}

package <missing>;

public class GlobalMembers
{
	public static sz p;
	public static void Main(String[] args)
	{
		int n;
		int i;
		int m;
		int add = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
		p = (sz)malloc(sizeof(sz) * n);
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(p + i).word = tempVar2.charAt(0);
			}
		}
		for (i = 0;i < n;i++)
		{
			m = String.valueOf((p + i).word).length();
			if (add + m < 80)
			{
				if (add > 0)
				{
					System.out.print(" ");
					add++;
				}
				System.out.printf("%s",(p + i).word);
				add += m;
			}
			else
			{
			System.out.printf("\n%s",(p + i).word);
			add = m;
			}
		}
	}

}

