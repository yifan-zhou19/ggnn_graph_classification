package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String word = new String(new char[41]);
		int sum = 0;
		int n;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = n;
		while (n > 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				word = tempVar2.charAt(0);
			}
			if ((sum + word.length() + 1 <= 80) && n != t)
			{
				System.out.print(" ");
				sum++;
			}
			else
			{
				System.out.print("\n");
				sum = 0;
			}
			sum = sum + word.length();
			System.out.printf("%s",word);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(word,0,(Character.SIZE / Byte.SIZE));
			n--;
		}
	}

}

