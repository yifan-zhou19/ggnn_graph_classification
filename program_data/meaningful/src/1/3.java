   for (int k=0; k<n-1; k++)
      for (int j=k+1; j<n; j++)
          if (data[k] > data[j]) {
             int tmp = data[k];
             data[k] = data[j];
             data[j] = tmp;
          }
