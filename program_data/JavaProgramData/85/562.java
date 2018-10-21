package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int i;
	 int j;
	 String[] string;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 //??????
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
//C++ TO JAVA CONVERTER TODO TASK: There is no Java equivalent to 'sizeof':
	 string = (String)malloc(sizeof(String) * n);
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  String[i] = (String)malloc((Character.SIZE / Byte.SIZE) * 20);
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  string[i] = tempVar2.charAt(0);
	  }
	 }

	 for (i = 0;i < n;i++)
	 {
	  if (!((String[i][0] >= 'A' && string[i][0] <= 'Z') || (String[i][0] >= 'a' && string[i][0] <= 'z') || string[i][0] == '_')) //??????????????�???????�?????
	  {
	   System.out.print("no\n");
	   continue;
	  }
	  for (j = 1;string[i][j];j++) //????????????string[i][j]?0??false?for?????
	  {
	   if (!((String[i][j] >= '0' && string[i][j] <= '9') || (String[i][j] >= 'A' && string[i][j] <= 'Z') || (String[i][j] >= 'a' && string[i][j] <= 'z') || string[i][j] == '_')) //??????????????????
	   {
		j = 0;
		break;
	   }
	  }
	  if (j != 0)
	  {
		  System.out.print("yes\n");
	  }
	  else
	  {
		  System.out.print("no\n");
	  }
	 }

	 //??????
	 for (i = 0;i < n;i++)
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	  free(String[i]);
	 }
	 String = null;
	 return 0;
	}

}

