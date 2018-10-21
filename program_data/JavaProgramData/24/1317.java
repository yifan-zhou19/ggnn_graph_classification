package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m = 0;
		int n = 10000;
		int l;
		String max;
		String min;
		String s;
		char b;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		max = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		min = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		s = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		for (;;)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				s = tempVar.charAt(0);
			}
			l = s.length();
			if (l < n)
			{
				min = s;
				n = l;
			}
			if (l > m)
			{
				max = s;
				m = l;
			}
			b = System.in.read();
			if (b != ' ')
			{
				break;
			}
		}
		System.out.printf("%s\n%s\n",max,min);
	}
}

