package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int l;
		int k = 0;
		int j;
		String p;
		String a;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		a = calloc(10000,(Character.SIZE / Byte.SIZE));
		p = a;
		p = new Scanner(System.in).nextLine();
		l = p.length();
		for (i = 0;i < l;i++)
		{
			if (*(p.Substring(i)) == ' ' && k == 0)
			{
				k = 1;
			}
			else if (*(p.Substring(i)) == ' ' && k == 1)
			{
				for (j = i;j < l - 1;j++)
				{
					*(p.Substring(j)) = *(p.Substring(j) + 1);
				}
				*(p.Substring(l) - 1) = 0;
				i--;
				l--;
			}
			  else
			  {
				  k = 0;
			  }
		}
		System.out.println(p);
	}
}
