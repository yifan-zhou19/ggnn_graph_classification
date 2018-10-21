package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 String string = new String(new char[257]);
	 String substring = new String(new char[257]);
	 String replacement = new String(new char[257]);
	 int h;
	 int i;
	 int j;
	 int k;
	 int l1;
	 int l2;
	 int l3;
	 int temp;
	 int r = 0;
	 int flag = 0;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 String = tempVar;
	 }
	 String tempVar2 = ConsoleInput.scanfRead();
	 if (tempVar2 != null)
	 {
		 substring = tempVar2.charAt(0);
	 }
	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 replacement = tempVar3.charAt(0);
	 }
	 l1 = String.length();
	 l2 = substring.length();
	 l3 = replacement.length();
	 for (i = 0;i < l1;i++)
	 {
		   if (String[i] == substring.charAt(0))
		   {
			temp = i;
			r = 0;
				for (j = 0;j < l2;j++)
				{
					 if (String[temp + j] == substring.charAt(j))
					 {
					  r = r + 1;
					 }
				}
				if (r == l2)
				{

					 for (h = 0;h < temp;h++)
					 {
					  System.out.printf("%c",string.charAt(h));
					 }
					 for (j = 0;j < l3;j++)
					 {
					  System.out.printf("%c",replacement.charAt(j));
					 }
					 for (k = temp + l2;k < l1;k++)
					 {
					  System.out.printf("%c",string.charAt(k));
					 }

					return 0;
				}
		   }

	 }

	  System.out.printf("%s",String);
	  return 0;

	}

}

