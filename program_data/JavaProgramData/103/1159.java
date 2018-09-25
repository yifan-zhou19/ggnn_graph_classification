package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = tempVar.charAt(0);
		}
		int i = 1;
		int j = 0;
		int len = a.length();
		int count = 1;
		while (j < len)
		{
		 if (Character.toUpperCase(a.charAt(i)) == Character.toUpperCase(a.charAt(j)))
		 {
		 count++;
		 }
		 else
		 {
		  System.out.printf("(%c,%d)",Character.toUpperCase(a.charAt(j)),count);
		  j += count;
		  count = 1;
		 }
		 i++;
		}
	}
}

