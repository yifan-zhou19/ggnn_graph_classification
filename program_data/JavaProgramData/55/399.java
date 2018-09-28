package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int s;
	  int i;
	  int j;
	  int n;
	  int[] d = new int[1000];
	  String t = new String(new char[10000]);
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 a = Integer.parseInt(tempVar);
		 }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 t = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b = Integer.parseInt(tempVar3);
		 }
		 s = 0;
		 c = 1;
		 n = t.length();
		 for (i = n - 1;i >= 0;i--)
		 {
			 if (t.charAt(i) >= 'a' && t.charAt(i) <= 'z')
			 {
				 s = s + c * (t.charAt(i) - 87);
			 }
		 if (t.charAt(i) >= 'A' && t.charAt(i) <= 'Z')
		 {
			 s = s + c * (t.charAt(i) - 55);
		 }
		 if (t.charAt(i) >= '0' && t.charAt(i) <= '9')
		 {
			 s = s + c * (t.charAt(i) - '0');
		 }
		 c = c * a;
		 }
		 i = 0;
			  if (s == 0)
			  {
				  System.out.printf("%d",s);
			  }
		 while (s != 0)
		 {
			 if ((s % b) > 9)
			 {
				 d[i] = s % b + 55;
			 }
		   else
		   {
			   d[i] = s % b;
		   }
		 i++;
		 s = s / b;
		 }
		for (j = i - 1;j >= 0;j--)
		{
			if (d[j] >= 0 && d[j] <= 9)
			{
				System.out.printf("%d",d[j]);
			}
		  if (d[j] >= 65 && d[j] <= 90)
		  {
			  System.out.printf("%c",d[j]);
		  }
		}
	}


}

