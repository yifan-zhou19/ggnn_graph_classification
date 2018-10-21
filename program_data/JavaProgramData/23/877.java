package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String[] a = new String[30];
		int i;
		for (i = 0;;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
			a[i] = (String)calloc(1,20 * (Character.SIZE / Byte.SIZE));
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = tempVar.charAt(0);
			}
			if (System.in.read() == '\n')
			{
				break;
			}
		}
		for (;i >= 0;i--)
		{
			if (i == 0)
			{
				System.out.printf("%s",a[i]);
			}
			else
			{
				System.out.printf("%s ",a[i]);
			}
		}
	}
}

