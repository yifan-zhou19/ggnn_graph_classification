package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		char sp;
		char[][] word = new char[300][20];
		for (int i = 0;i < 300;i++)
		{
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 word[i] = tempVar.charAt(0);
			 }
			 String tempVar2 = ConsoleInput.scanfRead(null, 1);
			 if (tempVar2 != null)
			 {
				 sp = tempVar2.charAt(0);
			 }
			 len = String.valueOf(word[i]).length();
			 if (len == 0)
			 {
				 break;
			 }
			  if (i == 0)
			  {
				System.out.printf("%d",len);
			  }
			   else
			   {
				   System.out.printf(",%d",len);
			   }
		}
				return 0;
	}



}

