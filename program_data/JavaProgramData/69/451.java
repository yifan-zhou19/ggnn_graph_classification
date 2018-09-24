package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  String str1 = new String(new char[260]);
	  String str2 = new String(new char[260]);
	  int[] A = new int[260];
	  int[] B = new int[260];
	  int[] C = new int[260];
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  str2 = tempVar2.charAt(0);
	  }
	  int i;
	  int j = 1;
	  for (i = str1.length() - 1;i >= 0;i--)
	  {
	  A[(str1.length()) - i - 1] = str1.charAt(i) - '0';
	  }
	  for (i = str2.length() - 1;i >= 0;i--)
	  {
	  B[str2.length() - i - 1] = str2.charAt(i) - '0';
	  }
	  for (i = 0;i < 260;i++)
	  {
		  if (A[i] + B[i] > 9)
		  {
			  A[i + 1] += 1;
	   C[i] = (A[i] + B[i]) - 10;
		  }
	   else
	   {
		   C[i] = (A[i] + B[i]);
	   }
	  }

	  for (i = 259;i >= 0;i--)
	  {
	  if ((j != 1) || (C[i] != 0))
	  {
		  j = 0;
		  System.out.printf("%d",C[i]);
	  }
	  }
	  if ((C[0] == 0) && (j == 1))
	  {
	  System.out.print("0");
	  }
	}

}

