package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String p = new String(new char[20]);
		int i = 0;
		int ok = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (char[20])calloc(300,20 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s",*(p.Substring(i))) == 1)
		{
			if (ok != 0)
			{
				System.out.printf("%d",String.valueOf(*(p.Substring(i))).length());
				ok = 0;
			}
			else
			{
				System.out.printf(",%d",String.valueOf(*(p.Substring(i))).length());
			}
			i++;
		}

	  return 0;
	}
}
