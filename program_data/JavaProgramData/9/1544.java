package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int[] a = new int[150];
	  int tmp;
	  int j;
	  char[][] s = new char[150][20];
	  String ts = new String(new char[20]);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;i++)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			s[i] = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
	  }
	  for (i = 1;i < n;i++)
	  {
		for (j = 1;j <= n - i;j++)
		{
		  if (((a[j + 1] >= 60) && (a[j] < 60)) || ((a[j + 1]> a[j]) && (a[j] >= 60)))
		  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			  memcpy(ts,s[j],(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			  memcpy(s[j],s[j + 1],(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memcpy' has no equivalent in Java:
			  memcpy(s[j + 1],ts,(Character.SIZE / Byte.SIZE));
			  tmp = a[j];
			  a[j] = a[j + 1];
			  a[j + 1] = tmp;
		  }
		}
	  }
	  for (i = 1;i <= n;i++)
	  {
		System.out.printf("%s\n",s[i]);
	  }
	}
}

