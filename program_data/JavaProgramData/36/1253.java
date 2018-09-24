package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int[] a = new int[129];
	  int[] b = new int[129];
	  char c;
	  String tempVar = ConsoleInput.scanfRead(null, 1);
	  if (tempVar != null)
	  {
		  c = tempVar.charAt(0);
	  }
	  while (c != ' ')
	  {
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: a[(unsigned short)c]++;
		a[(short)c]++;
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
	  }
	  String tempVar3 = ConsoleInput.scanfRead(null, 1);
	  if (tempVar3 != null)
	  {
		  c = tempVar3.charAt(0);
	  }
	  while (c != '\n')
	  {
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: b[(unsigned short)c]++;
		b[(short)c]++;
		String tempVar4 = ConsoleInput.scanfRead(null, 1);
		if (tempVar4 != null)
		{
			c = tempVar4.charAt(0);
		}
	  }
	  for (i = 1;i <= 128;i++)
	  {
		 if (a[i] != b[i])
		 {
			 break;
		 }
	  }
	  if (i > 128)
	  {
		  System.out.print("YES");
	  }
	  else
	  {
		  System.out.print("NO");
	  }
	  return 0;
	}
}

