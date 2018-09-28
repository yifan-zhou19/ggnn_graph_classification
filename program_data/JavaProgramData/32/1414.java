package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String a = new String(new char[201]);
	  String b = new String(new char[201]);
	  int i;
	  int mark;
	  int[] a1 = new int[201];
	  int[] b1 = new int[201];
	  int[] c1 = new int[201];
	  int chang1;
	  int chang2;
	  int chang3;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  mark = Integer.parseInt(tempVar);
	  }
	  while (mark-- != 0)
	  {
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  a = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  b = tempVar3.charAt(0);
	  }
	  //???????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(a1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(b1,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	  memset(c1,0,(Integer.SIZE / Byte.SIZE));
	  chang1 = a.length();
	  chang2 = b.length();
	  for (i = 0 ; i < chang1 ; i++)
	  {
		a1[i] = a.charAt(chang1 - 1 - i) - '0';
	  }
	  for (i = 0 ; i < chang2 ; i++)
	  {
		b1[i] = b.charAt(chang2 - 1 - i) - '0';
	  }
	  chang3 = chang1;
	  for (i = 0 ; i < chang3 ; i++)
	  {
	  c1[i] += a1[i] - b1[i];
	  if (c1[i] < 0)
	  {
		  c1[i + 1]--;
		  c1[i] += 10;
	  }
	  }
	  if (c1[chang3 - 1] == 0)
	  {
		chang3--;
	  }
	  for (i = chang3 - 1; i >= 0 ; i--)
	  {
		System.out.printf("%d",c1[i]);
	  }
	  System.out.print("\n");
	  }
	  return 0;
	}

}

