package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  void sort(char array[],int n);
	  String str1 = new String(new char[100]);
	  String str2 = new String(new char[100]);
	  int i;
	  int j;
	  int l1;
	  int l2;
	  int temp;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  str1 = tempVar.charAt(0);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  str2 = tempVar2.charAt(0);
	  }
	  l1 = str1.length();
	  l2 = str2.length();
	  sort(str1, l1);
	  sort(str2, l2);
	  if (strcmp(str1,str2) == 0)
	  {
	  System.out.print("YES");
	  }
	  else
	  {
		  System.out.print("NO");
	  }
	}
	 public static void sort(String array, int n)
	 {
	  int i;
	  int j;
	  char ch;
	  for (i = 0;i < n - 1;i++)
	  {
	  for (j = i + 1;j < n;j++)
	  {
		if (array[i].compareTo(array[j]) > 0)
		{
		  ch = array[i];
		  array[i] = array[j];
		  array[j] = ch;
		}
	  }
	  }
	 }
}

