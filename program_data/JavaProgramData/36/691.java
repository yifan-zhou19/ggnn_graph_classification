package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] num1 = new int[52];
	int[] num2 = new int[52];
	int i;
	int k;
	int flag = 1;
	String a = new String(new char[20]);
	String b = new String(new char[20]);
	char n1;
	char n2;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	n1 = a.length();
	n2 = b.length();
	  for (i = 0;i < 52;i++)
	  {
	  num1[i] = 0;
	  num2[i] = 0;
	  }
	  for (i = 0;i < n1;i++)
	  {
	   if (a.charAt(i) >= 65 && a.charAt(i) <= 90)
	   {
	   k = a.charAt(i) - 65;
	   num1[k]++;
	   }
	   if (a.charAt(i) >= 97 && a.charAt(i) <= 122)
	   {
	   k = a.charAt(i) - 71;
	   num1[k]++;
	   }
	  }

	  for (i = 0;i < n2;i++)
	  {
	   if (b.charAt(i) >= 65 && b.charAt(i) <= 90)
	   {
	   k = b.charAt(i) - 65;
	   num2[k]++;
	   }
	   if (b.charAt(i) >= 97 && b.charAt(i) <= 122)
	   {
	   k = b.charAt(i) - 71;
	   num2[k]++;
	   }
	  }
	  for (i = 0;i < 52;i++)
	  {
	  if (num1[i] != num2[i])
	  {
		  flag = 0;
	  }

	  }
	  if (flag != 0)
	  {
		  System.out.print("YES");
	  }
	  else
	  {
		  System.out.print("NO");
	  }
	}
}

