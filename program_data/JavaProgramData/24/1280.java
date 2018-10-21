package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int max = 0;
		int min = 100;
		String[] p = new String[50];
		for (i = 0;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			p[i] = (String)calloc(1,30);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p[i] = tempVar.charAt(0);
			}
			if (String.valueOf(p[i]).length() > max)
			{
				max = String.valueOf(p[i]).length();
			}
			if (String.valueOf(p[i]).length() < min)
			{
				min = String.valueOf(p[i]).length();
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (i = 0;;i++)
		{
			if (String.valueOf(p[i]).length() == max)
			{
			System.out.printf("%s\n",p[i]);
			break;
			}
		}
		for (i = 0;;i++)
		{
			if (String.valueOf(p[i]).length() == min)
			{
			System.out.printf("%s\n",p[i]);
			break;
			}
		}
	}

}

