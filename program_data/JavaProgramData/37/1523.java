package <missing>;

public class GlobalMembers
{
		public static int Main()
		{
		int t;
		int num;
		int x;
		String zf = new String(new char[100020]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < t;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			zf = tempVar2.charAt(0);
		}
		x = 0;
		for (int j = 0;j < zf.length();j++)
		{
				  num = 0;
				  for (int t = 0;t < zf.length();t++)
				  {
						   if (zf.charAt(t) == zf.charAt(j) && (t != j))
						   {
						   num++;
						   break;
						   }
				  }
				  if (num == 0)
				  {
				  System.out.printf("%c\n",zf.charAt(j));
				  x = 1;
				  break;
				  }
		}
		if (x == 0)
		{
		System.out.print("no\n");
		}
		}
	return 0;
		}
}

