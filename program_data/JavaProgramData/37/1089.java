package <missing>;

public class GlobalMembers
{
	public static String rec = new String(new char[200]);
	public static int Main()
	{
		String s = new String(new char[10000]);
		int i;
		int j;
		int l;
		int t;
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 0;j < n;j++)
		{
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 s = tempVar2.charAt(0);
		 }
		 for (i = 0;i < 200;i++)
		 {
		  rec = rec.substring(0, i);
		 }
		 l = s.length();
		 for (i = 0;i < l;i++)
		 {
		  rec.charAt(s.charAt(i))++;
		 }
		 t = 0;
		 for (i = 0;i < l;i++)
		 {
		  if (rec.charAt(s.charAt(i)) == 1)
		  {
			System.out.printf("%c\n",s.charAt(i));
			t = 1;
			break;
		  }
		 }
		 if (t == 0)
		 {
			 System.out.print("no\n");
		 }
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			i = Integer.parseInt(tempVar3);
		}
		return 0;
	}


}

