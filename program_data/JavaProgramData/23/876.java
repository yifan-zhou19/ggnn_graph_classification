package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] a = new String[100];
		char c = '\n';
		int i;
		for (i = 0;;)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			a[i] = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			i++;
			if (c == System.in.read())
			{
				break;
			}
		}
		for (i = i - 1;i >= 0;i--)
		{
		if (i != 0)
		{
			System.out.printf("%s ",a[i]);
		}
		else
		{
			System.out.printf("%s",a [i]);
		}
		}
	}
}

