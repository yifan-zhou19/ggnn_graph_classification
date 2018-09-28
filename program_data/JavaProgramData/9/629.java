package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int[] age = new int[100];
		  int[] a = new int[100];
		  int k = 0;
		  int count = 0;
		  int[] c = new int[100];
		  int i;
		  int j;
		  char[][] ID = new char[100][100];
		  char[][] id = new char[100][100];
		  String string = new String(new char[100]);
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (int i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  ID[i] = tempVar2.charAt(0);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  age[i] = Integer.parseInt(tempVar3);
			  }
		  }
		  for (i = 0;i < n;i++)
		  {
			  if (age[i] >= 60)
			  {
				   a[k] = age[i];
				   id[k] = ID[i];
				   count++;
				   c[k] = k;
				   k++;
			  }
		  }
		  for (k = 0;k < count;k++)
		  {
			  for (int j = k + 1;j < count;j++)
			  {
			  if (a[k] < a[j])
			  {
				   int t = a[j];
				   a[j] = a[k];
				   a[k] = t;
				   String = id[k];
				   id[k] = id[j];
				   id[j] = String;
				   int p = c[k];
				   c[k] = c[j];
				   c[j] = p;
			  }
			  }
		  }
		  for (k = 0;k < count;k++)
		  {
			 for (int j = k + 1;j < count;j++)
			 {
				if (a[k] == a[j])
				{
				  if (c[k] > c[j])
				  {
				   int t = a[j];
				   a[j] = a[k];
				   a[k] = t;
				   String = id[k];
				   id[k] = id[j];
				   id[j] = String;
				   int p = c[k];
				   c[k] = c[j];
				   c[j] = p;
				  }
				}
			 }
		  }
		  for (k = 0;k < count;k++)
		  {
			System.out.printf("%s\n",id[k]);
		  }
		  for (i = 0;i < n;i++)
		  {
			   if (age[i] < 60)
			   {
				 System.out.printf("%s\n",ID[i]);
			   }
		  }
		  System.in.read();
		  System.in.read();
	}

}

