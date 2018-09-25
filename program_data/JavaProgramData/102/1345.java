package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int n;
	 int a = 0;
	 int b = 0;
	 int paohuihaoduo;
	 final String zonggong = "female";
	 String paohui = new String(new char[7]);
	 float[] hanzi = new float[40];
	 float[] meizi = new float[40];
	 float paohuierhao;
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
		  paohui = tempVar2.charAt(0);
	  }
	  paohuihaoduo = strcmp(paohui,zonggong);
	  if (paohuihaoduo == 0)
	  {
	   String tempVar3 = ConsoleInput.scanfRead();
	   if (tempVar3 != null)
	   {
		   meizi[a] = Float.parseFloat(tempVar3);
	   }
	   a++;
	  }
	  else
	  {
	   String tempVar4 = ConsoleInput.scanfRead();
	   if (tempVar4 != null)
	   {
		   hanzi[b] = Float.parseFloat(tempVar4);
	   }
	   b++;
	  }
	 }
	 for (int i = 0;i < b - 1;i++)
	 {
	  for (int j = i + 1;j < b;j++)
	  {
	   if (hanzi[i] > hanzi[j])
	   {
		paohuierhao = hanzi[i];
		hanzi[i] = hanzi[j];
		hanzi[j] = paohuierhao;
	   }
	  }
	 }
	 for (int i = 0;i < a - 1;i++)
	 {
	  for (int j = i + 1;j < a;j++)
	  {
	   if (meizi[i] < meizi[j])
	   {
		paohuierhao = meizi[i];
		meizi[i] = meizi[j];
		meizi[j] = paohuierhao;
	   }
	  }
	 }
	 for (int i = 0;i < b;i++)
	 {
	  System.out.printf("%.2f ",hanzi[i]);
	 }
	 for (int i = 0;i < a;i++)
	 {
	  if (i == a - 1)
	  {
	   System.out.printf("%.2f",meizi[i]);
	  }
	  else
	  {
	   System.out.printf("%.2f ",meizi[i]);
	  }
	 }
	 return 0;
	}
}

