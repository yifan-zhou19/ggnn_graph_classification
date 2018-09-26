package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		String p;
		String pp;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (String)calloc(num,(Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		n = p.length();
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		pp = (String)calloc(n,(Character.SIZE / Byte.SIZE));
		i = 0;
		j = 0;
		k = 0;
		while (i < n)
		{
			if (*(p.Substring(i)) == ' ')
			{
				if (k == 0)
				{
					*(pp.Substring(j)) = *(p.Substring(i));
					j++;
					i++;
					k++;
				}
				else
				{
					i++;
				}
			}
			else
			{
				*(pp.Substring(j)) = *(p.Substring(i));
				j++;
				i++;
				k = 0;
			}
		}
		*(pp.Substring(j)) = '\0';
		System.out.printf("%s\n",pp);
	}
}
