package <missing>;

public class GlobalMembers
{
	public static void reverse(String a)
	{
		int i;
		int p;
	 char t;
	 if (!a[0].equals('-'))
	 {
		 for (i = 0;i < a.length() / 2;i++)
		 {
	  t = a[i],a[i] = a[a.length() - i - 1],a[a.length() - i - 1] = t;
		 }
	  p = 0;
	  while (a[p].equals('0'))
	  {
		  p++;
	  }
	  for (i = p;i < a.length();i++)
	  {
	  System.out.printf("%c",a[i]);
	  }
	  System.out.print("\n");
	 }
	 else
	 {
	  if (a[1].equals('0'))
	  {
		  System.out.print("0\n");
	  }
	  else
	  {
		  for (i = 1;i < (a.length() / 2 + 1);i++)
		  {
	   t = a[i],a[i] = a[a.length() - i],a[a.length() - i] = t;
		  }
	   System.out.print("-");
	   p = 1;
	   while (a[p].equals('0'))
	   {
		   p++;
	   }
	   for (i = p;i < a.length();i++)
	   {
	   System.out.printf("%c",a[i]);
	   }
	   System.out.print("\n");
	  }
	 }

	}

	public static int Main()
	{
		int i;
	 for (i = 0;i < 6;i++)
	 {
	  String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = (String)malloc((Character.SIZE / Byte.SIZE) * 100);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p = tempVar.charAt(0);
	  }
	  reverse(p);
	 }
	}
}

