public class ID
{
	public String idnum = new String(new char[100]);
	public int old;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	ID[] ido = tangible.Arrays.initializeWithDefaultIDInstances(100); //???????
	ID[] idy = tangible.Arrays.initializeWithDefaultIDInstances(100); //???????
	ID[] id = tangible.Arrays.initializeWithDefaultIDInstances(100); //???????
	ID e = new ID();
	int n;
	int i;
	int a = 0;
	int b = 0;
	int j;
	int l;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
							 String tempVar2 = ConsoleInput.scanfRead();
							 if (tempVar2 != null)
							 {
								 id[i].idnum = tempVar2.charAt(0);
							 }
							 String tempVar3 = ConsoleInput.scanfRead(" ");
							 if (tempVar3 != null)
							 {
								 (id[i].old) = Integer.parseInt(tempVar3);
							 }
							 if (id[i].old >= 60)
							 { //????60 ????????????????
												  ido[a].idnum = id[i].idnum;
												  ido[a].old = id[i].old;
												  a++;
							 }
							  else
							  { //?????????????????
									 idy[b].idnum = id[i].idnum;
									 idy[b].old = id[i].old;
									 b++;
							  }
	}

	for (k = 1 ; k <= a ; k++)
	{ //?????????
		for (i = 0; i < a - k; i++)
		{
				if (ido[i].old < ido[i + 1].old)
				{
//C++ TO JAVA CONVERTER TODO TASK: The following line was determined to be a copy assignment (rather than a reference assignment) - this should be verified and a 'copyFrom' method should be created:
//ORIGINAL LINE: e = ido[i+1];
						e.copyFrom(ido[i + 1]);
						ido[i + 1] = ido[i];
						ido[i] = e;
				}
		}
	}

	for (j = 0;j < a;j++)
	{ //????
		System.out.printf("%s\n",ido[j].idnum);
	}
	for (l = 0;l < b;l++)
	{
		System.out.printf("%s\n",idy[l].idnum);
	}

	return 0;
	}

}

